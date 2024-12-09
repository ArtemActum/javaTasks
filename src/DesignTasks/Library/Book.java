package DesignTasks.Library;



public class Book {
    public Book(String name) {
        this.name = name;
        this.currentPage = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int page) throws Exception {
        if(page < 1) throw new Exception("Page number should more than 1");
        this.currentPage = page;
    }

    public void readNextPage(){
        this.currentPage++;
    }

    private String name;
    private int currentPage;
}
