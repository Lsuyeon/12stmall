package stmall.domain;

import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long orderid;
    private Long productid;
    private String productName;
    private Integer qty;
    private String status;
}
