import java.util.*;

public class Composite {

    public Composite() {

        Post post = new Post("hey dad love uou");
        post.like();

        Comment comment = new Comment("whack lol");
        post.add(comment);
        comment.like();
        comment.like();
        comment.like();

        Comment subComment = new Comment("be nice man");
        subComment.like();
        comment.add(subComment);

        int likes = post.getLikes();
        System.out.println(likes);
    }

    private abstract class Likeable {
        private String content;
        private int likes = 0;
        private ArrayList<Likeable> children;

        public Likeable(String content) {
            children = new ArrayList<>();
            this.content = content;
        }

        public void add(Likeable obj) {
            children.add(obj);
        }

        public int getLikes() {
            int totalSubLikes = likes;
            for (Likeable child : children) {
                totalSubLikes += child.getLikes();
            }

            return totalSubLikes;
        }

        public void like() {
            likes++;
        }
    }

    private class Post extends Likeable {

        public Post(String content) {
            super(content);

        }
    }

    private class Comment extends Likeable {
        public Comment(String content) {
            super(content);
        }
    }

}
