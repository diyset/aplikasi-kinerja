package id.ac.tazkia.kinerja.aplikasikinerja.dto;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class NotifikasiResetPassword {
    private String konfigurasi;
    private String email;
    private String mobile;
    private Object data;
}
