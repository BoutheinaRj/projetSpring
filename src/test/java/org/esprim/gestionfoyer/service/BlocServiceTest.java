package org.esprim.gestionfoyer.service.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.esprim.gestionfoyer.service.dto.BlocDTO;
import org.esprim.gestionfoyer.service.entity.Bloc;
import org.esprim.gestionfoyer.service.mapper.BlocMapper;
import org.esprim.gestionfoyer.service.repository.BlocRepository;
import org.esprim.gestionfoyer.service.service.impl.BlocServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

 public class BlocServiceTest 
{

    @Mock
    private BlocRepository blocRepository;

    @Mock
    private BlocMapper blocMapper;

    @InjectMocks
    private BlocServiceImpl blocService;

    private Bloc bloc;
    private BlocDTO blocDTO;
    private List<Bloc> blocList;
    private Long testId;

    @BeforeEach
    void setUp()
{
        // Setup test data
        testId = 1L;

        bloc = new Bloc();
        // Set id directly on the entity using reflection or direct field access if needed
        // For test purposes, we'll mock the responses instead of relying on actual entity getter methods

        blocDTO = new BlocDTO();
        blocDTO.setId(testId);

        blocList = new ArrayList<>();
        blocList.add(bloc);
    }

    @Test
    void testSave()
{
        // Arrange
        when(blocMapper.toEntity(any(BlocDTO.class))).thenReturn(bloc);
        when(blocRepository.save(any(Bloc.class))).thenReturn(bloc);
        when(blocMapper.toDto(any(Bloc.class))).thenReturn(blocDTO);

        // Act
        BlocDTO result = blocService.save(blocDTO);

        // Assert
        assertThat(result).isNotNull();
        verify(blocRepository).save(any(Bloc.class));
        verify(blocMapper).toDto(any(Bloc.class));
    }

    @Test
    void testFindAll()
{
        // Arrange
        List<BlocDTO> dtoList = new ArrayList<>();
        dtoList.add(blocDTO);

        when(blocRepository.findAll()).thenReturn(blocList);

        // Stub the individual entity mapping instead of the list mapping
        // This correctly handles the stream().map() call in the service
        when(blocMapper.toDto(any(Bloc.class))).thenReturn(blocDTO);

        // Act
        List<BlocDTO> result = blocService.findAll();

        // Assert
        assertThat(result).isNotNull().hasSize(1);
        verify(blocRepository).findAll();
    }

    @Test
    void testFindOne()
{
        // Arrange
        when(blocRepository.findById(any())).thenReturn(Optional.of(bloc));
        when(blocMapper.toDto(any(Bloc.class))).thenReturn(blocDTO);

        // Act
        BlocDTO result = blocService.findOne(testId);

        // Assert
        assertThat(result).isNotNull();
        verify(blocRepository).findById(any());
    }

    @Test
    void testDelete()
{
        // Arrange
        doNothing().when(blocRepository).deleteById(any());

        // Act
        blocService.delete(testId);

        // Assert
        verify(blocRepository).deleteById(any());
    }
}
