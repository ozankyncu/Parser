package Modules;

public class Article {

    private String article_name;
    private String authors;
    private String article_title;
    private int article_number;
    private String abst;
    private String mdurl;
    private String pdf;
    private int spage;
    private int epage;
    private String doi;
    private String issn;
    private String isbn;

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getArticle_number() {
        return article_number;
    }

    public void setArticle_number(int article_number) {
        this.article_number = article_number;
    }

    public String getArticle_name() {
        return article_name;
    }

    public void setArticle_name(String article_name) {
        this.article_name = article_name;
    }

    public String getAbst() {
        return abst;
    }

    public void setAbst(String abst) {
        this.abst = abst;
    }

    public String getMdurl() {
        return mdurl;
    }

    public void setMdurl(String mdurl) {
        this.mdurl = mdurl;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public int getSpage() {
        return spage;
    }

    public void setSpage(int spage) {
        this.spage = spage;
    }

    public int getEpage() {
        return epage;
    }

    public void setEpage(int epage) {
        this.epage = epage;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;


    }
}
