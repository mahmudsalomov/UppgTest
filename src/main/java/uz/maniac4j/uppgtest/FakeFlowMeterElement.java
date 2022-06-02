package uz.maniac4j.uppgtest;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class FakeFlowMeterElement {
    private int id;
    private String name;
    private String fullName;
    private String description;
    private double v;
    private int quality;
    private String timestamp;
    private int scaleMin;
    private int scaleMax;

}
