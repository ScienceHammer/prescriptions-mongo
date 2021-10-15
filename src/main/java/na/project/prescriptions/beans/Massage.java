package na.project.prescriptions.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Massage {

    private String userFromId;
    private String massage;
    private Date issuedDate;

    @PostConstruct
    private void init() {
        this.issuedDate = new Date(System.currentTimeMillis());
    }

}
