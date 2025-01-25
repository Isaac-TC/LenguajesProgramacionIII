package com.itsqmet.validacion.Entidad;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class paciente {

    @Size(min = 3 , max = 50)
    private String nombre;

    @Size(min = 3 , max = 50)
    private String apellido;

    @NotBlank
    @Pattern(regexp = "\\d{10}")
    private String cedula;

    @NotBlank
    @Pattern(regexp = "\\d{10}")
    private String telefono;

    @NotBlank
    @Email(message = "Ingrese el correo en formato válido")
    private String email;

    @Size(min = 10, max =150)
    private String domicilio;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;

    @Min(value = 1)
    @Max(value = 100)
    private String edad;

    @Min(value = 1)
    @Max(value = 100)
    private String peso;

    @Min(value = 1)
    @Max(value = 250)
    private String estatura;

    @NotBlank
    private String genero;

    @NotBlank
    private String alergias;

    @NotBlank
    private String nacionalidad;



}
