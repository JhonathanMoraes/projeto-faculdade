
package com.projetofaculdade.fasterfood.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Calendar;
import java.util.List;

@Entity
public class Order {
    
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "costumer_name")
    private Costumer costumerName;
    
    private Calendar dataHora;
    private List<OrderStatus> orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Costumer getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(Costumer costumerName) {
        this.costumerName = costumerName;
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }

    public List<OrderStatus> getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(List<OrderStatus> orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    
    public double total(){
        
        // TODO Finalizar método
        return 0;
    }
}
