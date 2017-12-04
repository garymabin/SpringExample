package com.thoughtworks.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(name = "addr1")
    private String addr1;

    @Column(name = "addr2")
    private String addr2;

    @JoinColumn(name = "customer_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

}
