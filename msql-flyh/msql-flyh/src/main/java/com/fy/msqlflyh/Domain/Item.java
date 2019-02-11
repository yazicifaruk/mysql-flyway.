package com.fy.msqlflyh.Domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="items")
@Getter
@Setter
public class Item{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private int quantity;

       @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "product_id")
        private Product product;

       @ManyToOne
       @JoinColumn(name="order_id")
       private Order order;
}
