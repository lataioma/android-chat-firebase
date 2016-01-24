package edu.galileo.android.androidchat.contactlist;

/**
 * Created by ykro.
 */
public interface ContactListRepository {
    void signOff();
    void removeContact(String email);
    void destroyContactListListener();
    void subscribeForContactListUpdates();
    void unSubscribeForContactListUpdates();
    void changeUserConnectionStatus(boolean online);

}
