package shejimoshi.chapter15;

/**
 * @author jiaxiangyu
 * @date 2022/4/4 2:22 下午
 */
public interface Department {
    void Insert(Department department);

    Department getDepartmentById(int id);
}
