package personalproject.netoflix.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@Service
public class FileService {
    public String uploadFile(String path, MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
    
        // Usa Paths.get para construir o caminho corretamente
        Path filePath = Paths.get(path, fileName);
    
        // Cria uma instância de File para o diretório
        File dir = new File(path);
    
        // Verifica se o diretório existe, se não, cria (usando mkdirs para garantir criação de subdiretórios)
        if (!dir.exists()) {
            dir.mkdirs();  // Cria o diretório e subdiretórios, se necessário
        }
    
        // Salva o arquivo no diretório especificado
        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
    
        return "File uploaded: " + fileName;
    }

    public InputStream getResourceFile(String path, String filename) throws FileNotFoundException {
        String filePath = path + File.separator + filename;
        return new FileInputStream(filePath);
    }
}
