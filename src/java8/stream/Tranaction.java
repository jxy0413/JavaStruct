package java8.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jiaxiangyu
 * @date 2023/1/2 10:27 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tranaction {
    private Trader trader;
    private Integer dateYear;
    private Double money;
}
