package na.project.prescriptions.beans;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mail {

    private String subject;
    private String userToId;
    private List<Massage> massages;
    private Date issuedDate;

    @PostConstruct
    private void init() {
        this.issuedDate = new Date(System.currentTimeMillis());
    }

}
