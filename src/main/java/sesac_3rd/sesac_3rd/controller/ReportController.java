package sesac_3rd.sesac_3rd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sesac_3rd.sesac_3rd.dto.report.ReportDTO;
import sesac_3rd.sesac_3rd.handler.ResponseHandler;
import sesac_3rd.sesac_3rd.service.report.ReportService;


@RestController
@RequestMapping("/api/report")
@RequiredArgsConstructor
public class ReportController {
    private final ReportService reportService;

    // 신고 생성
    @PostMapping
    public ResponseEntity<ResponseHandler<ReportDTO.Report>> createReport(@RequestBody ReportDTO.Report reportDto) {
        ReportDTO.Report createdReport = reportService.createReportIfNotExist(reportDto);
        return ResponseHandler.response(createdReport, HttpStatus.CREATED, "신고 성공");
    }

}