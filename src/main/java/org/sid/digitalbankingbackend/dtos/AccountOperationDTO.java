package dtos;


import lombok.Data;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private org.sid.digitalbankingbackend.enums.OperationType type;
    private String description;
}
