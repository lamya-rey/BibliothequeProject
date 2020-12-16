@RestController
@RequestMapping(path = "/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping
    public Iterable<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("/{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId") int bookId) {
        return bookRepository.findById(userId);
    }
}

