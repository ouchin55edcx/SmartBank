package com.ouchin.banksmart.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "requests")

public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;

    @NotNull(message = "The project name cannot be null")
    @Size(min = 2, max = 50, message = "Project name must be between 2 and 50 characters")
    @Column(length = 50, nullable = false)
    private String project_name;

    @NotNull(message = "The profession cannot be null")
    @Size(min = 2, max = 50, message = "Profession must be between 2 and 50 characters")
    @Column(length = 50, nullable = false)
    private String profession;

    @NotNull(message = "Amount cannot be null")
    @Positive(message = "Amount must be positive")
    @Column(nullable = false)
    private int amount;

    @NotNull(message = "Duration cannot be null")
    @PastOrPresent(message = "Duration must be in the past or present")
    @Column(nullable = false)
    private LocalDate duration;

    @NotNull(message = "Monthly payments cannot be null")
    @PositiveOrZero(message = "Monthly payments must be positive or zero")
    @Column(nullable = false)
    private float monthly_payments;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Email should be valid")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "Phone number cannot be null")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    @Column(nullable = false, unique = true, length = 10)
    private String phone_number;

    @NotNull(message = "Civility cannot be null")
    @Column(nullable = false)
    private String civility;

    @NotNull(message = "First name cannot be null")
    @Size(min = 2, max = 15, message = "First name must be between 2 and 15 characters")
    @Column(nullable = false, length = 15)
    private String first_name;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, max = 15, message = "Last name must be between 2 and 15 characters")
    @Column(nullable = false, length = 15)
    private String last_name;

    @NotNull(message = "CIN cannot be null")
    @Pattern(regexp = "^[A-Za-z0-9]{8}$", message = "CIN must be exactly 8 alphanumeric characters")
    @Column(nullable = false, length = 8)
    private String cin;

    @NotNull(message = "Date of birth cannot be null")
    @Past(message = "Date of birth must be in the past")
    @Column(nullable = false)
    private LocalDate date_of_birth;

    @NotNull(message = "Start date cannot be null")
    @PastOrPresent(message = "Start date must be in the past or present")
    @Column(nullable = false)
    private LocalDate start_date;

    @NotNull(message = "Monthly net income cannot be null")
    @PositiveOrZero(message = "Monthly net income must be positive or zero")
    @Column(nullable = false)
    private BigDecimal monthly_net_income;


    @NotNull(message = "Loan status cannot be null")
    @Column(nullable = false)
    private boolean has_current_loans;

    @PositiveOrZero(message = "Mortgage monthly payment must be positive or zero")
    @Column(nullable = true)
    private BigDecimal mortgage_monthly_payment;

    @PositiveOrZero(message = "Other loans monthly payment must be positive or zero")
    @Column(nullable = true)
    private BigDecimal other_loans_monthly_payment;

    public Request(Long id, String project_name, String profession, int amount, LocalDate duration, float monthly_payments, String email, String phone_number, String civility, String first_name, String last_name, String cin, LocalDate date_of_birth, LocalDate start_date, BigDecimal monthly_net_income, boolean has_current_loans, BigDecimal mortgage_monthly_payment, BigDecimal other_loans_monthly_payment) {
        this.id = id;
        this.project_name = project_name;
        this.profession = profession;
        this.amount = amount;
        this.duration = duration;
        this.monthly_payments = monthly_payments;
        this.email = email;
        this.phone_number = phone_number;
        this.civility = civility;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cin = cin;
        this.date_of_birth = date_of_birth;
        this.start_date = start_date;
        this.monthly_net_income = monthly_net_income;
        this.has_current_loans = has_current_loans;
        this.mortgage_monthly_payment = mortgage_monthly_payment;
        this.other_loans_monthly_payment = other_loans_monthly_payment;
    }


    public Request() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "The project name cannot be null") @Size(min = 2, max = 50, message = "Project name must be between 2 and 50 characters") String getProject_name() {
        return project_name;
    }

    public void setProject_name(@NotNull(message = "The project name cannot be null") @Size(min = 2, max = 50, message = "Project name must be between 2 and 50 characters") String project_name) {
        this.project_name = project_name;
    }

    public @NotNull(message = "The profession cannot be null") @Size(min = 2, max = 50, message = "Profession must be between 2 and 50 characters") String getProfession() {
        return profession;
    }

    public void setProfession(@NotNull(message = "The profession cannot be null") @Size(min = 2, max = 50, message = "Profession must be between 2 and 50 characters") String profession) {
        this.profession = profession;
    }

    @NotNull(message = "Amount cannot be null")
    @Positive(message = "Amount must be positive")
    public int getAmount() {
        return amount;
    }

    public void setAmount(@NotNull(message = "Amount cannot be null") @Positive(message = "Amount must be positive") int amount) {
        this.amount = amount;
    }

    public @NotNull(message = "Duration cannot be null") @PastOrPresent(message = "Duration must be in the past or present") LocalDate getDuration() {
        return duration;
    }

    public void setDuration(@NotNull(message = "Duration cannot be null") @PastOrPresent(message = "Duration must be in the past or present") LocalDate duration) {
        this.duration = duration;
    }

    @NotNull(message = "Monthly payments cannot be null")
    @PositiveOrZero(message = "Monthly payments must be positive or zero")
    public float getMonthly_payments() {
        return monthly_payments;
    }

    public void setMonthly_payments(@NotNull(message = "Monthly payments cannot be null") @PositiveOrZero(message = "Monthly payments must be positive or zero") float monthly_payments) {
        this.monthly_payments = monthly_payments;
    }

    public @NotNull(message = "Email cannot be null") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email cannot be null") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotNull(message = "Phone number cannot be null") @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits") String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(@NotNull(message = "Phone number cannot be null") @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits") String phone_number) {
        this.phone_number = phone_number;
    }

    public @NotNull(message = "Civility cannot be null") String getCivility() {
        return civility;
    }

    public void setCivility(@NotNull(message = "Civility cannot be null") String civility) {
        this.civility = civility;
    }

    public @NotNull(message = "First name cannot be null") @Size(min = 2, max = 15, message = "First name must be between 2 and 15 characters") String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(@NotNull(message = "First name cannot be null") @Size(min = 2, max = 15, message = "First name must be between 2 and 15 characters") String first_name) {
        this.first_name = first_name;
    }

    public @NotNull(message = "Last name cannot be null") @Size(min = 2, max = 15, message = "Last name must be between 2 and 15 characters") String getLast_name() {
        return last_name;
    }

    public void setLast_name(@NotNull(message = "Last name cannot be null") @Size(min = 2, max = 15, message = "Last name must be between 2 and 15 characters") String last_name) {
        this.last_name = last_name;
    }

    public @NotNull(message = "CIN cannot be null") @Pattern(regexp = "^[A-Za-z0-9]{8}$", message = "CIN must be exactly 8 alphanumeric characters") String getCin() {
        return cin;
    }

    public void setCin(@NotNull(message = "CIN cannot be null") @Pattern(regexp = "^[A-Za-z0-9]{8}$", message = "CIN must be exactly 8 alphanumeric characters") String cin) {
        this.cin = cin;
    }

    public @NotNull(message = "Date of birth cannot be null") @Past(message = "Date of birth must be in the past") LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(@NotNull(message = "Date of birth cannot be null") @Past(message = "Date of birth must be in the past") LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public @NotNull(message = "Start date cannot be null") @PastOrPresent(message = "Start date must be in the past or present") LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(@NotNull(message = "Start date cannot be null") @PastOrPresent(message = "Start date must be in the past or present") LocalDate start_date) {
        this.start_date = start_date;
    }

    public @NotNull(message = "Monthly net income cannot be null") @PositiveOrZero(message = "Monthly net income must be positive or zero") BigDecimal getMonthly_net_income() {
        return monthly_net_income;
    }

    public void setMonthly_net_income(@NotNull(message = "Monthly net income cannot be null") @PositiveOrZero(message = "Monthly net income must be positive or zero") BigDecimal monthly_net_income) {
        this.monthly_net_income = monthly_net_income;
    }

    @NotNull(message = "Loan status cannot be null")
    public boolean isHas_current_loans() {
        return has_current_loans;
    }

    public void setHas_current_loans(@NotNull(message = "Loan status cannot be null") boolean has_current_loans) {
        this.has_current_loans = has_current_loans;
    }

    public @PositiveOrZero(message = "Mortgage monthly payment must be positive or zero") BigDecimal getMortgage_monthly_payment() {
        return mortgage_monthly_payment;
    }

    public void setMortgage_monthly_payment(@PositiveOrZero(message = "Mortgage monthly payment must be positive or zero") BigDecimal mortgage_monthly_payment) {
        this.mortgage_monthly_payment = mortgage_monthly_payment;
    }

    public @PositiveOrZero(message = "Other loans monthly payment must be positive or zero") BigDecimal getOther_loans_monthly_payment() {
        return other_loans_monthly_payment;
    }

    public void setOther_loans_monthly_payment(@PositiveOrZero(message = "Other loans monthly payment must be positive or zero") BigDecimal other_loans_monthly_payment) {
        this.other_loans_monthly_payment = other_loans_monthly_payment;
    }




}
