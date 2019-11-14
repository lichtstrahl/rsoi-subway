package iv.root.subway.model.station

import iv.root.subway.model.branch.Branch
import iv.root.subway.model.exit.Exit
import java.io.Serializable
import javax.persistence.*

@Entity(name = "station")
data class Station (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "name", nullable = false)
        var name: String,
        @ManyToOne
        @JoinColumn(name = "branch_id", referencedColumnName = "id", nullable = false)
        var branch: Branch,
// -----------------------
        @OneToMany(mappedBy = "station", orphanRemoval = true)
        var exits: Set<Exit>
): Serializable