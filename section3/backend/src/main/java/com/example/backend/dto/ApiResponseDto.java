package com.example.backend.dto;

public record ApiResponseDto<T>(
        boolean success,
        T data,
        String error
) {}