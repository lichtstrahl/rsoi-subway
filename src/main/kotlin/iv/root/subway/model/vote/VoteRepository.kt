package iv.root.subway.model.vote

import org.springframework.data.jpa.repository.JpaRepository

interface VoteRepository: JpaRepository<Vote, Long> {
}