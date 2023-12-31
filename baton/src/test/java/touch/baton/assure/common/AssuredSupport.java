package touch.baton.assure.common;

import io.restassured.RestAssured;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

public class AssuredSupport {

    public static ExtractableResponse<Response> get(final String uri, final String pathParamName, final Long id) {
        return RestAssured
                .given().log().ifValidationFails()
                .when().log().ifValidationFails()
                .pathParam(pathParamName, id)
                .get(uri)
                .then().log().ifError()
                .extract();
    }

    public static ExtractableResponse<Response> delete(final String uri, final String pathParamName, final Long id) {
        return RestAssured
                .given().log().ifValidationFails()
                .when().log().ifValidationFails()
                .contentType(APPLICATION_JSON_VALUE)
                .pathParam(pathParamName, id)
                .delete(uri)
                .then().log().ifError()
                .extract();
    }
}
