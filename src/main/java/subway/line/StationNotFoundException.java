package subway.line;

public class StationNotFoundException extends RuntimeException {

    public StationNotFoundException(long stationId) {
        super("역 정보 없음 : " + stationId);
    }
}
