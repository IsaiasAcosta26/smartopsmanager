package com.projectSystem.system.service.template;

import java.time.LocalDateTime;

public abstract class AbstractReservationTemplate<T> {

    public final T validateAndCreate(T dto) {
        validateDates(dto);
        validateCustom(dto);
        return create(dto);
    }

    protected void validateDates(T dto) {
        LocalDateTime start = getStartDate(dto);
        LocalDateTime end = getEndDate(dto);
        if (start == null || end == null || !start.isBefore(end)) {
            throw new IllegalArgumentException("La fecha de inicio debe ser anterior a la fecha de fin.");
        }
    }

    protected abstract void validateCustom(T dto);

    protected abstract T create(T dto);

    protected abstract LocalDateTime getStartDate(T dto);

    protected abstract LocalDateTime getEndDate(T dto);
}
