package ch.keepcalm.microservice.rr.reactive.tweet;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Document(collection = "tweets")
public class Tweet {

    @Id
    public String id;

    @NotBlank
    @Size(max = 140)
    public String text;

    @NotNull
    public LocalDateTime createdAt;
//    private LocalDateTime createdAt = LocalDateTime.now();


}

