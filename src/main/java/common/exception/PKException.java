package common.exception;

import common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PKException extends RuntimeException{

    private ExceptionEnum exceptionEnum;

}
