package com.kodilla.testing.forum.statistics;

public class StatisticsCalculations {
    double totalAmountOfUsers;
    double totalAmountOfPostsOnForum;
    double totalAmountOfCommentsOnForum;
    double postsAverageByUser;
    double commentsAverageByUser;
    double commentsAverageByPost;

    public double getTotalAmountOfUsers() {
        return totalAmountOfUsers;
    }

    public void setTotalAmountOfUsers(double totalAmountOfUsers) {
        this.totalAmountOfUsers = totalAmountOfUsers;
    }

    public double getTotalAmountOfPostsOnForum() {
        return totalAmountOfPostsOnForum;
    }

    public void setTotalAmountOfPostsOnForum(double totalAmountOfPostsOnForum) {
        this.totalAmountOfPostsOnForum = totalAmountOfPostsOnForum;
    }

    public double getTotalAmountOfCommentsOnForum() {
        return totalAmountOfCommentsOnForum;
    }

    public void setTotalAmountOfCommentsOnForum(double totalAmountOfCommentsOnForum) {
        this.totalAmountOfCommentsOnForum = totalAmountOfCommentsOnForum;
    }

    public double getPostsAverageByUser() {
        return postsAverageByUser;
    }

    public void setPostsAverageByUser(double postsAverageByUser) {
        this.postsAverageByUser = postsAverageByUser;
    }

    public double getCommentsAverageByUser() {
        return commentsAverageByUser;
    }

    public void setCommentsAverageByUser(double commentsAverageByUser) {
        this.commentsAverageByUser = commentsAverageByUser;
    }

    public double getCommentsAverageByPost() {
        return commentsAverageByPost;
    }

    public void setCommentsAverageForByPost(double commentsAverageByPost) {
        this.commentsAverageByPost = commentsAverageByPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        // count the total amount of users on forum
        totalAmountOfUsers = statistics.username().size();

        // count the total amount of posts on forum
        totalAmountOfPostsOnForum = statistics.postsCount();

        // count the total amount of comments on forum
        totalAmountOfCommentsOnForum = statistics.commentsCount();

        // count the average of posts by user
        if (totalAmountOfUsers > 0) {
            postsAverageByUser = totalAmountOfPostsOnForum / totalAmountOfUsers;
        } else {
            postsAverageByUser = 0;
        }

        // count the average of comments by user
        if (totalAmountOfUsers > 0) {
            commentsAverageByUser = totalAmountOfCommentsOnForum/totalAmountOfUsers;
        } else {
            commentsAverageByUser = 0;
        }
        // count the average of comments by post
        if (totalAmountOfPostsOnForum > 0) {
            commentsAverageByPost = totalAmountOfCommentsOnForum / totalAmountOfPostsOnForum;
        } else {
            commentsAverageByPost = 0;
        }
    }

    public String showStatistics(){
        // show statistics
        return "The total amount of users on forum: " + totalAmountOfUsers + "\n"
                + "The total amount of posts on forum: " + totalAmountOfPostsOnForum + "\n"
                + "The total amount of comments on forum: " + totalAmountOfCommentsOnForum + "\n"
                + "The average of posts by user: " + postsAverageByUser + "\n"
                + "The average of comments by user: " + commentsAverageByUser + "\n"
                + "The average of comments by post: " + commentsAverageByPost;
    }
}
