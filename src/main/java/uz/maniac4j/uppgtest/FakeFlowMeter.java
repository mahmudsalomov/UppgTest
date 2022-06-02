package uz.maniac4j.uppgtest;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeFlowMeter {
    List<FakeFlowMeterElement> fakeFlowMeterElements;
}
