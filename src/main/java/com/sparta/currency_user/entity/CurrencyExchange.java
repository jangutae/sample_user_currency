package com.sparta.currency_user.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table()
public class CurrencyExchange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //  User_id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "to_currency_id")
    private Currency currency;

    private BigDecimal amountInKrw;
    private BigDecimal amountAfterExchange;
    private String status;





}
