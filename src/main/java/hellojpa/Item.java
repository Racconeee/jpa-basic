package hellojpa;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Item {

    @Id @GeneratedValue
    private int id;

    private String name;
    private int Price;
}
