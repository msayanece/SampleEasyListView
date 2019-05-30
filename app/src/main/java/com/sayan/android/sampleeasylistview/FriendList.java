package com.sayan.android.sampleeasylistview;

public class FriendList {

    private String id;
    private String profilePic;
    private String name;
    private String lastOnlineTime;
    private String unreadChatCount;
    private String lastChatContent;
    private String isOnline;


    public FriendList() {
    }

    public FriendList(String id, String profilePic, String name, String lastOnlineTime, String unreadChatCount, String lastChatContent, String isOnline) {
        this.id = id;
        this.profilePic = profilePic;
        this.name = name;
        this.lastOnlineTime = lastOnlineTime;
        this.unreadChatCount = unreadChatCount;
        this.lastChatContent = lastChatContent;
        this.isOnline = isOnline;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastOnlineTime() {
        return lastOnlineTime;
    }

    public void setLastOnlineTime(String lastOnlineTime) {
        this.lastOnlineTime = lastOnlineTime;
    }

    public String getUnreadChatCount() {
        return unreadChatCount;
    }

    public void setUnreadChatCount(String unreadChatCount) {
        this.unreadChatCount = unreadChatCount;
    }

    public String getLastChatContent() {
        return lastChatContent;
    }

    public void setLastChatContent(String lastChatContent) {
        this.lastChatContent = lastChatContent;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }


}
