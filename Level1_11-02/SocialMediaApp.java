import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }
}

class SocialMedia {
    private User head;

    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    private User findUser(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        if (user1 != null && user2 != null && userId1 != userId2) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
                user2.friendIds.add(userId1);
            }
        }
    }

    public void removeFriend(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(userId2));
            user2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        if (user1 == null || user2 == null) return;
        System.out.print("Mutual Friends: ");
        for (int id : user1.friendIds) {
            if (user2.friendIds.contains(id)) {
                System.out.print(id + " ");
            }
        }
        System.out.println();
    }

    public void displayFriends(int userId) {
        User user = findUser(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        }
    }

    public void searchUser(String nameOrId) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(nameOrId) || String.valueOf(temp.userId).equals(nameOrId)) {
                System.out.println("User Found: " + temp.name + " (ID: " + temp.userId + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

   
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }
}

public class SocialMediaApp {
    public static void main(String[] args) {
        SocialMedia network = new SocialMedia();
        
        network.addUser(1, "Alice", 25);
        network.addUser(2, "Bob", 27);
        network.addUser(3, "Charlie", 22);
        
        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);
        
        network.displayFriends(1);
        network.displayFriends(2);
        network.displayFriends(3);
        
        network.findMutualFriends(1, 2);
        
        network.countFriends();
        
        network.searchUser("Alice");
        network.searchUser("3");
        
        network.removeFriend(1, 2);
        network.displayFriends(1);
        network.displayFriends(2);
    }
}

