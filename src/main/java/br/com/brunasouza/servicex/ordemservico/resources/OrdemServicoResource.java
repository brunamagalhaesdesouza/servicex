//package br.com.brunasouza.servicex.ordemservico.resources;
//
//import br.com.brunasouza.servicex.ordemservico.domain.OrdemServico;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//
//@RestController
//@RequestMapping(value = "/ordemservicos")
//public class OrdemServicoResource {
//
//    @Autowired
//    private OrdemServicoService ordemServicoService;
//
//    @PostMapping
//    public ResponseEntity<OrdemServico> criarOS(@ResponseBody OrdemServico ordemServico){
//        ordemServico.criarOS(ordemServico);
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand()(ordemServicoService.getIdOrdemServico())
//    }
//}
