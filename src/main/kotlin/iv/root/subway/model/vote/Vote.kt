package iv.root.subway.model.vote

import iv.root.subway.model.exit.Exit
import java.io.Serializable
import javax.persistence.*

@Entity(name = "vote")
data class Vote (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "value", nullable = false)
        var value: Int,
        @Column(name = "comment")
        var comment: String?,
        @ManyToOne
        @JoinColumn(name = "exit_id", referencedColumnName = "id", nullable = false)
        var exit: Exit,
        @Column(name = "user_id", nullable = false)
        var userID: Long
): Serializable