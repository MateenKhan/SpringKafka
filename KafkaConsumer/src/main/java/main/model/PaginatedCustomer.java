package main.model;

import java.util.List;
import java.util.Objects;

public class PaginatedCustomer   {
  private Integer pageNumber = null;

  private Integer pageSize = null;

  private Integer total = null;

  private List<Customer> data = null;

  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedCustomer paginatedCustomer = (PaginatedCustomer) o;
    return Objects.equals(this.pageNumber, paginatedCustomer.pageNumber) &&
        Objects.equals(this.pageSize, paginatedCustomer.pageSize) &&
        Objects.equals(this.total, paginatedCustomer.total) &&
        Objects.equals(this.data, paginatedCustomer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedCustomer {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
