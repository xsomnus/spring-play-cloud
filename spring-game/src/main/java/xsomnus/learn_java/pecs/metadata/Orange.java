package xsomnus.learn_java.pecs.metadata;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/3/26 0026 14:05
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Orange extends Fruit{

    private Integer price;

}
