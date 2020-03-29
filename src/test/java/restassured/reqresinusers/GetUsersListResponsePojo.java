package restassured.reqresinusers;

import java.util.List;

class GetUsersListResponsePojo {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<GetSingleUserResponsePojo.Data> data;

    int getPage() {
        return page;
    }

    int getPer_page() {
        return per_page;
    }

    int getTotal() {
        return total;
    }

    int getTotal_pages() {
        return total_pages;
    }

    List<GetSingleUserResponsePojo.Data> getData() {
        return data;
    }
}
