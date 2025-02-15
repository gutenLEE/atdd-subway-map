package subway.fixture;

import io.restassured.RestAssured;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import subway.line.LineResponse;

import java.util.Map;

public class LineSteps {
    public static LineResponse createLine(Map<String, Object> param) {
        return RestAssured.given().log().all()
                .when()
                .body(param)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .post("/lines")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .extract()
                .as(LineResponse.class);
    }
}
