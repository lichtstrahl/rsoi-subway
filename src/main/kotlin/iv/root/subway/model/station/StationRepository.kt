package iv.root.subway.model.station

import org.springframework.data.jpa.repository.JpaRepository

interface StationRepository: JpaRepository<Station, Long> {
}