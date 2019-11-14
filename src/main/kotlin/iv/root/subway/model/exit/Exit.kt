package iv.root.subway.model.exit

import iv.root.subway.model.station.Station
import iv.root.subway.model.vote.Vote
import java.io.Serializable
import javax.persistence.*

@Entity(name = "exit")
data class Exit (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false, unique = true)
        var id: Long,
        @Column(name = "number", nullable = false)
        var number: Long,
        @ManyToOne
        @JoinColumn(name = "station_id", referencedColumnName = "id", nullable = false)
        var station: Station,
// -------------------------
        @OneToMany(mappedBy = "exit", orphanRemoval = true)
        var votes: Set<Vote>
): Serializable