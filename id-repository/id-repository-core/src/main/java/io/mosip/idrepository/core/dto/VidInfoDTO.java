package io.mosip.idrepository.core.dto;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Manoj SP
 *
 */    
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VidInfoDTO {

	private String vid;
	private String vidType;
	private LocalDateTime expiryTimestamp;
	private LocalDateTime genratedOnTimestamp;
	private Integer transactionLimit;
	private Map<String, String> hashAttributes;
}
