package model;

import javax.persistence.*;

@Entity
@Table(name="warehouse_items")
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_id")

    long    id ;

    @Column()
    String warehouseUniqId;

    @OneToOne
    @JoinColumn(name="product_id")

    private Product product;

    @Column(name="quantity")
    int quantity;



}
