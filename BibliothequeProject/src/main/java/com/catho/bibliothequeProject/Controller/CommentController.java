@RestController
@RequestMapping(path = "/comments")
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }
    @GetMapping("/{bookId}")
    public Optional<Comment> getCommentsByBookId(@PathVariable("bookId") int bookId) {
        return commentRepository.findById(userId);
    }
}



