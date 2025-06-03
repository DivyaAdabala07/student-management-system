public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCase(String name);
    List<Student> findByStudentClassContainingIgnoreCase(String studentClass);
}
