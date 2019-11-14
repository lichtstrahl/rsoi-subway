package iv.root.subway.model.branch

import org.springframework.data.jpa.repository.JpaRepository

interface BranchRepository: JpaRepository<Branch, Long> {
}