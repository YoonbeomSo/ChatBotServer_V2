package chatbot.admin.service;

import chatbot.admin.dao.StoreDAO;

import java.util.Map;

public class AdminService {

    public AdminService() {
    }

    public Map<String, String> lookStore() {

        return StoreDAO.getInstance().getStoreList();

    }

    public String deleteStore(String stno) {
        return StoreDAO.getInstance().deleteStoreInfo(stno);
    }

    public String addStore(Map<String, Object> model) {
        Map<String, String> requestParamMap = (Map<String, String>) model.get("requestParam");
        String stName = requestParamMap.get("stName");
        System.out.println("storeName=" + stName);
        return StoreDAO.getInstance().insertStore(stName);
    }

    public String addStoreInfo(Map<String, Object> model) {
        Map<String, String> requestParam = (Map<String, String>) model.get("requestParam");
        String stName = (String) model.get("requestStName");
        return StoreDAO.getInstance().insertStoreInfo(stName, requestParam);
    }
}
