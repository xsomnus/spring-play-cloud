package xsomnus.learn_java.pecs.metadata;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author @xsomnus666_xiawenye★
 * @since 2019/3/26 0026 14:04
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Banana extends Fruit {

    private Integer weight;

}
