package tss.information;

import org.jetbrains.annotations.Nls;

import java.util.List;

public class AddInstructorsResponse {
    @Nls private final String status;
    private final List<String> failUids;

    public AddInstructorsResponse(String status, List<String> failUids) {
        this.status = status;
        this.failUids = failUids;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getFailUids() {
        return failUids;
    }
}
