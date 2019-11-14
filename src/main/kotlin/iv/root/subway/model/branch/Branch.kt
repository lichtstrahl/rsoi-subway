package iv.root.subway.model.branch

import iv.root.subway.model.station.Station
import java.io.Serializable
import javax.persistence.*

@Entity(name = "branch")
data class Branch (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    var id: Long,
    @Column(name = "name", nullable = false)
    var name: String,
    @Column(name = "color", nullable = false)
    var color: String,
    @Column(name = "number", nullable = false)
    var number: Int,
// --------------------------
    @OneToMany(mappedBy = "branch", orphanRemoval = true)
    var stations: Set<Station>
): Serializable