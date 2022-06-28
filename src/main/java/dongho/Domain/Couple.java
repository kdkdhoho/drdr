package dongho.Domain;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Couple {
    private @Id @GeneratedValue Long id;

    private String nickName;
}
